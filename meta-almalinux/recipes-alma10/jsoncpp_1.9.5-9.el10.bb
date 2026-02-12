
inherit dnf-bridge

PN = "jsoncpp"
PE = "0"
PV = "1.9.5"
PR = "9.el10"
PACKAGES = "jsoncpp jsoncpp-devel jsoncpp-doc"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/jsoncpp-1.9.5-9.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_jsoncpp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/jsoncpp-1.9.5-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_jsoncpp}"
RDEPENDS:jsoncpp = " \
 glibc \
 libgcc \
 libstdc++ \
"

URI_jsoncpp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/jsoncpp-devel-1.9.5-9.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_jsoncpp-devel}"
RDEPENDS:jsoncpp-devel = " \
 jsoncpp \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_jsoncpp-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/jsoncpp-doc-1.9.5-9.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_jsoncpp-doc}"
RDEPENDS:jsoncpp-doc = ""
