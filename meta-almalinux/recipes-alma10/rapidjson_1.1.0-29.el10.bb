
inherit dnf-bridge

PN = "rapidjson"
PE = "0"
PV = "1.1.0"
PR = "29.el10"
PACKAGES = "rapidjson-devel rapidjson-doc"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/rapidjson-1.1.0-29.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_rapidjson-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rapidjson-devel-1.1.0-29.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_rapidjson-devel}"
RDEPENDS:rapidjson-devel = " \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_rapidjson-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/rapidjson-doc-1.1.0-29.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_rapidjson-doc}"
RDEPENDS:rapidjson-doc = ""
