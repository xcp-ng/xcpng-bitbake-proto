
inherit dnf-bridge

PN = "mkfontscale"
PE = "0"
PV = "1.2.2"
PR = "8.el10"
PACKAGES = "mkfontscale"


URI_mkfontscale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mkfontscale-1.2.2-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:mkfontscale = " \
 zlib-ng-compat \
 freetype \
 bash \
 glibc \
 libfontenc \
"
