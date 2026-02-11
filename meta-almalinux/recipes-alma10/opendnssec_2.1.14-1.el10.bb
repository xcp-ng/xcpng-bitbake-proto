
inherit dnf-bridge

PN = "opendnssec"
PE = "0"
PV = "2.1.14"
PR = "1.el10"
PACKAGES = "opendnssec"


URI_opendnssec = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/opendnssec-2.1.14-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:opendnssec = " \
 softhsm \
 shadow-utils \
 zlib-ng-compat \
 systemd \
 libxslt \
 ldns \
 openssl-libs \
 libxml2 \
 sqlite-libs \
 bash \
 opencryptoki \
 glibc \
 sqlite \
 xz-libs \
"
