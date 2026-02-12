
inherit dnf-bridge

PN = "PEGTL"
PE = "0"
PV = "2.8.3"
PR = "10.el10"
PACKAGES = "PEGTL-devel"


URI_src = "https://vault.almalinux.org/10.0/devel/Source/Packages/PEGTL-2.8.3-10.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_PEGTL-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/PEGTL-devel-2.8.3-10.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_PEGTL-devel}"
RDEPENDS:PEGTL-devel = " \
 libstdc++-devel \
"
