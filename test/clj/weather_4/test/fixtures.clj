(ns weather-4.test.fixtures)

(def a-darksky-reading-body
  {:timezone "Europe/London",
   :daily {:icon "snow",
           :summary "Light snow (under 1 cm.) on Saturday, with temperatures rising to 12°C on Wednesday.",
           :data [{:precipIntensityMaxTime 1486652400,
                   :pressure 1027.4,
                   :apparentTemperatureMaxTime 1486648800,
                   :ozone 390.05,
                   :cloudCover 0.86,
                   :temperatureMax 3.18,
                   :precipIntensity 0.0127,
                   :windSpeed 3.67,
                   :apparentTemperatureMax -0.47,
                   :time 1486598400,
                   :precipType "rain",
                   :precipIntensityMax 0.033,
                   :icon "fog",
                   :temperatureMin 0.35,
                   :moonPhase 0.45,
                   :humidity 0.91,
                   :summary "Foggy in the evening.",
                   :apparentTemperatureMin -3.51,
                   :apparentTemperatureMinTime 1486620000,
                   :dewPoint 0.28,
                   :precipProbability 0.02,
                   :temperatureMinTime 1486620000,
                   :temperatureMaxTime 1486648800,
                   :windBearing 46,
                   :sunsetTime 1486659909,
                   :sunriseTime 1486625133,
                   :visibility 6.87}
                  {:precipIntensityMaxTime 1486738800,
                   :pressure 1025.33,
                   :apparentTemperatureMaxTime 1486684800,
                   :ozone 380.96,
                   :cloudCover 0.99,
                   :temperatureMax 2.43,
                   :precipIntensity 0.0203,
                   :windSpeed 4.64,
                   :apparentTemperatureMax -1.16,
                   :time 1486684800,
                   :precipType "snow",
                   :precipIntensityMax 0.0305,
                   :icon "cloudy",
                   :temperatureMin -1.24,
                   :moonPhase 0.49,
                   :humidity 0.87,
                   :summary "Overcast throughout the day.",
                   :apparentTemperatureMin -6.17,
                   :apparentTemperatureMinTime 1486767600,
                   :dewPoint -1.27,
                   :precipProbability 0.02,
                   :temperatureMinTime 1486767600,
                   :temperatureMaxTime 1486684800,
                   :precipAccumulation 0.358,
                   :windBearing 37,
                   :sunsetTime 1486746418,
                   :sunriseTime 1486711427,
                   :visibility 11.52}
                  {:precipIntensityMaxTime 1486825200,
                   :pressure 1023.86,
                   :apparentTemperatureMaxTime 1486821600,
                   :ozone 404.59,
                   :cloudCover 0.94,
                   :temperatureMax 3.98,
                   :precipIntensity 0.0406,
                   :windSpeed 4.53,
                   :apparentTemperatureMax 0.13,
                   :time 1486771200,
                   :precipType "snow",
                   :precipIntensityMax 0.1016,
                   :icon "snow",
                   :temperatureMin -1.65,
                   :moonPhase 0.52,
                   :humidity 0.87,
                   :summary "Flurries starting in the evening.",
                   :apparentTemperatureMin -6.73,
                   :apparentTemperatureMinTime 1486778400,
                   :dewPoint -1.11,
                   :precipProbability 0.16,
                   :temperatureMinTime 1486778400,
                   :temperatureMaxTime 1486821600,
                   :precipAccumulation 0.749,
                   :windBearing 19,
                   :sunsetTime 1486832928,
                   :sunriseTime 1486797719,
                   :visibility 14.92}
                  {:precipIntensityMaxTime 1486911600,
                   :pressure 1021.57,
                   :apparentTemperatureMaxTime 1486900800,
                   :ozone 409.88,
                   :cloudCover 0.78,
                   :temperatureMax 5.27,
                   :precipIntensity 0.0254,
                   :windSpeed 6.35,
                   :apparentTemperatureMax 0.88,
                   :time 1486857600,
                   :precipType "rain",
                   :precipIntensityMax 0.061,
                   :icon "partly-cloudy-day",
                   :temperatureMin 0.4,
                   :moonPhase 0.55,
                   :humidity 0.89,
                   :summary "Mostly cloudy throughout the day.",
                   :apparentTemperatureMin -4.33,
                   :apparentTemperatureMinTime 1486864800,
                   :dewPoint 0.83,
                   :precipProbability 0.07,
                   :temperatureMinTime 1486864800,
                   :temperatureMaxTime 1486900800,
                   :windBearing 62,
                   :sunsetTime 1486919438,
                   :sunriseTime 1486884010,
                   :visibility 16.09}
                  {:precipIntensityMaxTime 1486976400,
                   :pressure 1020.47,
                   :apparentTemperatureMaxTime 1486990800,
                   :ozone 376.57,
                   :cloudCover 0.58,
                   :temperatureMax 7,
                   :precipIntensity 0.0254,
                   :windSpeed 7.3,
                   :apparentTemperatureMax 2.98,
                   :time 1486944000,
                   :precipType "rain",
                   :precipIntensityMax 0.0686,
                   :icon "partly-cloudy-day",
                   :temperatureMin 2.57,
                   :moonPhase 0.59,
                   :humidity 0.87,
                   :summary "Partly cloudy throughout the day.",
                   :apparentTemperatureMin -2.81,
                   :apparentTemperatureMinTime 1486969200,
                   :dewPoint 1.93,
                   :precipProbability 0.09,
                   :temperatureMinTime 1486969200,
                   :temperatureMaxTime 1486990800,
                   :windBearing 80,
                   :sunsetTime 1487005947,
                   :sunriseTime 1486970299,
                   :visibility 16.09}
                  {:pressure 1021.8,
                   :apparentTemperatureMaxTime 1487080800,
                   :ozone 385.53,
                   :cloudCover 0.66,
                   :temperatureMax 7.54,
                   :precipIntensity 0,
                   :windSpeed 5.87,
                   :apparentTemperatureMax 4.2,
                   :time 1487030400,
                   :precipIntensityMax 0,
                   :icon "partly-cloudy-day",
                   :temperatureMin 2.34,
                   :moonPhase 0.62,
                   :humidity 0.88,
                   :summary "Mostly cloudy throughout the day.",
                   :apparentTemperatureMin -2.73,
                   :apparentTemperatureMinTime 1487044800,
                   :dewPoint 2.42,
                   :precipProbability 0,
                   :temperatureMinTime 1487048400,
                   :temperatureMaxTime 1487080800,
                   :windBearing 95,
                   :sunsetTime 1487092456,
                   :sunriseTime 1487056587,
                   :visibility 15}
                  {:precipIntensityMaxTime 1487170800,
                   :pressure 1024.58,
                   :apparentTemperatureMaxTime 1487167200,
                   :ozone 388.02,
                   :cloudCover 0.81,
                   :temperatureMax 11.56,
                   :precipIntensity 0.0203,
                   :windSpeed 2.22,
                   :apparentTemperatureMax 11.56,
                   :time 1487116800,
                   :precipType "rain",
                   :precipIntensityMax 0.0406,
                   :icon "partly-cloudy-day",
                   :temperatureMin 3.87,
                   :moonPhase 0.65,
                   :humidity 0.93,
                   :summary "Mostly cloudy until evening.",
                   :apparentTemperatureMin 0.33,
                   :apparentTemperatureMinTime 1487116800,
                   :dewPoint 5.84,
                   :precipProbability 0.04,
                   :temperatureMinTime 1487199600,
                   :temperatureMaxTime 1487167200,
                   :windBearing 163,
                   :sunsetTime 1487178966,
                   :sunriseTime 1487142874}
                  {:precipIntensityMaxTime 1487224800,
                   :pressure 1025.53,
                   :apparentTemperatureMaxTime 1487253600,
                   :ozone 364.65,
                   :cloudCover 0.53,
                   :temperatureMax 11.03,
                   :precipIntensity 0.0127,
                   :windSpeed 0.95,
                   :apparentTemperatureMax 11.03,
                   :time 1487203200,
                   :precipType "rain",
                   :precipIntensityMax 0.0229,
                   :icon "partly-cloudy-day",
                   :temperatureMin 1.6,
                   :moonPhase 0.68,
                   :humidity 0.88,
                   :summary "Mostly cloudy throughout the day.",
                   :apparentTemperatureMin 1.6,
                   :apparentTemperatureMinTime 1487221200,
                   :dewPoint 3.88,
                   :precipProbability 0.01,
                   :temperatureMinTime 1487221200,
                   :temperatureMaxTime 1487253600,
                   :windBearing 22,
                   :sunsetTime 1487265474,
                   :sunriseTime 1487229159}]},
   :offset 0,
   :longitude 0.057,
   :currently {:pressure 1029.06,
               :nearestStormDistance 108,
               :ozone 396.61,
               :cloudCover 0.5,
               :precipIntensity 0,
               :windSpeed 2.83,
               :nearestStormBearing 46,
               :apparentTemperature -2.01,
               :time 1486610853,
               :icon "partly-cloudy-night",
               :humidity 0.87,
               :summary "Partly Cloudy",
               :dewPoint -0.77,
               :precipProbability 0,
               :windBearing 31,
               :visibility 9.45,
               :temperature 1.12},
   :latitude 51.317})
