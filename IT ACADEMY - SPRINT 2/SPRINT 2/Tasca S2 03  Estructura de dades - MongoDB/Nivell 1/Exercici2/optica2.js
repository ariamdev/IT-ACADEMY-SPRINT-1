db.createCollection('glasses', {
  validator: {
    $jsonSchema: {
      bsonType: 'object',
      title: 'glasses',
      required: ['brand', 'frame_type', 'provider', 'price', 'bought_by'],
      properties: {
        brand: {
          bsonType: 'string'
        },
        frame_type: {
          enum: 'Floating',
          'Plastic',
          'Metallic'
        },
        provider: {
          bsonType: 'object',
          title: 'object',
          required: ['name', 'adress', 'phone_number', 'fax', 'id'],
          properties: {
            name: {
              bsonType: 'string'
            },
            adress: {
              bsonType: 'object',
              title: 'object',
              required: ['adress_street', 'adress_num', 'adress_apt', 'adress_city', 'adress_country', 'adress_zip'],
              properties: {
                adress_street: {
                  bsonType: 'string'
                },
                adress_num: {
                  bsonType: 'string'
                },
                adress_apt: {
                  bsonType: 'int'
                },
                adress_city: {
                  bsonType: 'string'
                },
                adress_country: {
                  bsonType: 'string'
                },
                adress_zip: {
                  bsonType: 'int'
                }
              }
            },
            phone_number: {
              bsonType: 'int'
            },
            fax: {
              bsonType: 'int'
            },
            id: {
              bsonType: 'string'
            }
          }
        },
        price: {
          bsonType: 'decimal'
        },
        bought_by: {
          bsonType: 'object',
          title: 'object',
          required: ['client_name', 'client_data', 'recomended_by'],
          properties: {
            client_name: {
              bsonType: 'string'
            },
            client_data: {
              bsonType: 'object',
              title: 'object',
              required: ['adress', 'phone_number', 'email', 'register_date'],
              properties: {
                adress: {
                  bsonType: 'string'
                },
                phone_number: {
                  bsonType: 'int'
                },
                email: {
                  bsonType: 'string'
                },
                register_date: {
                  bsonType: 'date'
                }
              }
            },
            recomended_by: {
              bsonType: 'int'
            }
          }
        }
      }
    }
  }
});