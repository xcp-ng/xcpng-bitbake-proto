
inherit dnf-bridge

PN = "certmonger"
PE = "0"
PV = "0.79.20"
PR = "3.el10"
PACKAGES = "certmonger"


URI_certmonger = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/certmonger-0.79.20-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:certmonger = " \
 systemd \
 nss \
 krb5-libs \
 nss-util \
 dbus \
 dbus-libs \
 dbus-tools \
 jansson \
 libcom_err \
 libtalloc \
 libcurl \
 sed \
 libtevent \
 openldap \
 libuuid \
 openssl-libs \
 libxml2 \
 bash \
 libidn2 \
 popt \
 glibc \
 nspr \
"
