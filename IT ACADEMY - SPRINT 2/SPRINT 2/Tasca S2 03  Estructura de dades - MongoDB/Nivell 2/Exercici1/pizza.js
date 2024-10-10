db.createCollection('shop', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'shop',
      required: ['name', 'order', 'adress', 'zip', 'locality', 'province', 'employee'],
      properties: {
        name: {
          bsonType: 'string'
        },
        order: {
          bsonType: 'object',
          title: 'object',
          required: ['order_id', 'date_time', 'product', 'total_price', 'client', 'delivered', 'paid'],
          properties: {
            order_id: {
              bsonType: 'objectId'
            },
            date_time: {
              bsonType: 'timestamp'
            },
            product: {
              bsonType: 'object',
              title: 'object',
              required: ['product_id', 'product_type', 'name', 'quantity', 'description', 'image', 'price'],
              properties: {
                product_id: {
                  bsonType: 'objectId'
                },
                product_type: {
                  bsonType: 'object',
                  title: 'object',
                  required: ['pizza', 'burger', 'drink'],
                  properties: {
                    pizza: {
                      bsonType: 'object',
                      title: 'object',
                      required: ['category'],
                      properties: {
                        category: {
                          bsonType: 'string'
                        }
                      }
                    },
                    burger: {
                      bsonType: 'string'
                    },
                    drink: {
                      bsonType: 'string'
                    }
                  }
                },
                name: {
                  bsonType: 'string'
                },
                quantity: {
                  bsonType: 'int'
                },
                description: {
                  bsonType: 'string'
                },
                image: {
                  bsonType: 'string'
                },
                price: {
                  bsonType: 'decimal'
                }
              }
            },
            total_price: {
              bsonType: 'decimal'
            },
            client: {
              bsonType: 'object',
              title: 'object',
              required: ['client_id', 'name', 'surname', 'order_type'],
              properties: {
                client_id: {
                  bsonType: 'objectId'
                },
                name: {
                  bsonType: 'string'
                },
                surname: {
                  bsonType: 'string'
                },
                order_type: {
                  bsonType: 'object',
                  title: 'object',
                  required: ['take_away', 'delivery'],
                  properties: {
                    take_away: {
                      bsonType: 'string'
                    },
                    delivery: {
                      bsonType: 'object',
                      title: 'object',
                      required: ['adress', 'postal_code', 'town', 'province', 'phone_number', 'deliveryman_id', 'delivery_time', 'note'],
                      properties: {
                        adress: {
                          bsonType: 'string'
                        },
                        postal_code: {
                          bsonType: 'string'
                        },
                        town: {
                          bsonType: 'string'
                        },
                        province: {
                          bsonType: 'string'
                        },
                        phone_number: {
                          bsonType: 'int'
                        },
                        deliveryman_id: {
                          bsonType: 'objectId'
                        },
                        delivery_time: {
                          bsonType: 'timestamp'
                        },
                        note: {
                          bsonType: 'string'
                        }
                      }
                    }
                  }
                }
              }
            },
            delivered: {
              bsonType: 'bool'
            },
            paid: {
              bsonType: 'bool'
            }
          }
        },
        adress: {
          bsonType: 'string'
        },
        zip: {
          bsonType: 'string'
        },
        locality: {
          bsonType: 'string'
        },
        province: {
          bsonType: 'string'
        },
        employee: {
          bsonType: 'object',
          title: 'object',
          required: ['employee_id', 'name', 'surname', 'NIF', 'role'],
          properties: {
            employee_id: {
              bsonType: 'objectId'
            },
            name: {
              bsonType: 'string'
            },
            surname: {
              bsonType: 'string'
            },
            NIF: {
              bsonType: 'string'
            },
            role: {
              enum: 'Cook',
              'Deliveryman'
            }
          }
        }
      }
    }
  }
});