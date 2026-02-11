
PN = "lftp"
PE = "0"
PV = "4.9.2"
PR = "16.el10"
PACKAGES = "lftp"


URI_lftp = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/lftp-4.9.2-16.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:lftp = " \
 zlib-ng-compat \
 gnutls \
 libgcc \
 readline \
 libstdc++ \
 bash \
 ncurses-libs \
 glibc \
 libidn2 \
"
