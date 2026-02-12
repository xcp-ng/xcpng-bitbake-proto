
inherit dnf-bridge

PN = "libyaml"
PE = "0"
PV = "0.2.5"
PR = "16.el10"
PACKAGES = "libyaml libyaml-devel"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/libyaml-0.2.5-16.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libyaml = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/libyaml-0.2.5-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libyaml}"
RDEPENDS:libyaml = " \
 glibc \
"

URI_libyaml-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libyaml-devel-0.2.5-16.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libyaml-devel}"
RDEPENDS:libyaml-devel = " \
 pkgconf-pkg-config \
 libyaml \
"
