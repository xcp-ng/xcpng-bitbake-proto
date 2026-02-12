
inherit dnf-bridge

PN = "urlview"
PE = "0"
PV = "0.9"
PR = "39.20131022git08767a.el10"
PACKAGES = "urlview"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/urlview-0.9-39.20131022git08767a.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_urlview = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/urlview-0.9-39.20131022git08767a.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_urlview}"
RDEPENDS:urlview = " \
 glibc \
 bash \
 ncurses-libs \
"
