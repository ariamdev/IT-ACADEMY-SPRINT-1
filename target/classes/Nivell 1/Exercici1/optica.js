db.createCollection('client', {
      validator: {
        $jsonSchema: {
          bsonType: 'object',
          title: 'client',
          required: ['name', 'data', 'last_shopping', 'recommended_by_id'],
          properties: {
            name: {
              bsonType: 'string'
            },
            data: {
              bsonType: 'object',
              title: 'object',
              required: ['adress', 'telephone', 'email', 'register_date'],
              properties: {
                adress: {
                  bsonType: 'string'
                },
                telephone: {
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
            last_shopping: {
              bsonType: 'object',
              title: 'object',
              required: ['glasses', 'seller', 'date'],
              properties: {
                glasses: {
                  bsonType: 'object',
                  title: 'object',
                  required: ['brand', 'graduation', 'glass_color', 'frame_type', 'price'],
                  properties: {
                    brand: {
                      bsonType: 'string'
                    },
                    graduation: {
                      bsonType: 'object',
                      title: 'object',
                      required: ['left_eye', 'right_eye'],
                      properties: {
                        left_eye: {
                          bsonType: 'decimal'
                        },
                        right_eye: {
                          bsonType: 'decimal'
                        }
                      }
                    },
                    glass_color: {
                      bsonType: 'object',
                      title: 'object',
                      required: ['left_eye', 'right_eye'],
                      properties: {
                        left_eye: {
                          bsonType: 'decimal'
                        },
                        right_eye: {
                          bsonType: 'decimal'
                        }
                      }
                    },
                    frame_type: {
                      enum: 'Floating',
                      'Plastic',
                      ''
                      Metallic '},price:{bsonType: '
                      decimal '}}},seller:{bsonType: '
                      string '},date:{bsonType: '
                      date '}}},recommended_by_id:{bsonType: '
                      int '}}}}});