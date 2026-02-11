
PN = "rapidjson"
PE = "0"
PV = "1.1.0"
PR = "29.el10"
PACKAGES = "rapidjson-devel rapidjson-doc"


URI_rapidjson-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rapidjson-devel-1.1.0-29.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:rapidjson-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( )"
RPROVIDES:rapidjson-devel = "cmake(RapidJSON) ( ) cmake(rapidjson) ( ) pkgconfig(RapidJSON) ( =  1.1.0) rapidjson(x86-64) ( =  1.1.0-29.el10) rapidjson-devel ( =  1.1.0-29.el10) rapidjson-devel(x86-64) ( =  1.1.0-29.el10) rapidjson-static ( =  1.1.0-29.el10)"

URI_rapidjson-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rapidjson-doc-1.1.0-29.el10.noarch.rpm;unpack=0"
RDEPENDS:rapidjson-doc = ""
RPROVIDES:rapidjson-doc = "rapidjson-doc ( =  1.1.0-29.el10)"
