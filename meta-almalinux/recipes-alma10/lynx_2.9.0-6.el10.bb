
PN = "lynx"
PE = "0"
PV = "2.9.0"
PR = "6.el10"
PACKAGES = "lynx"


URI_lynx = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lynx-2.9.0-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lynx = " \
 zlib-ng-compat \
 bzip2-libs \
 openssl-libs \
 libbrotli \
 ncurses-libs \
 almalinux-indexhtml \
 glibc \
 libidn2 \
"
