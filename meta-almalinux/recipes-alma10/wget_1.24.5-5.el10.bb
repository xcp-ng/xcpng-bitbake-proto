
PN = "wget"
PE = "0"
PV = "1.24.5"
PR = "5.el10"
PACKAGES = "wget"


URI_wget = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/wget-1.24.5-5.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:wget = " \
 libuuid \
 zlib-ng-compat \
 gnutls \
 libpsl \
 pcre2 \
 glibc \
 libidn2 \
"
