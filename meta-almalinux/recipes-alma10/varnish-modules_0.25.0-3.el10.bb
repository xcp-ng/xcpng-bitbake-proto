
inherit dnf-bridge

PN = "varnish-modules"
PE = "0"
PV = "0.25.0"
PR = "3.el10"
PACKAGES = "varnish-modules"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/varnish-modules-0.25.0-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_varnish-modules = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/varnish-modules-0.25.0-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_varnish-modules}"
RDEPENDS:varnish-modules = " \
 glibc \
 varnish \
"
