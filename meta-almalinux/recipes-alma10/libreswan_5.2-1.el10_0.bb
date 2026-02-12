
inherit dnf-bridge

PN = "libreswan"
PE = "0"
PV = "5.2"
PR = "1.el10_0"
PACKAGES = "libreswan"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/libreswan-5.2-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_libreswan = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libreswan-5.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_libreswan}"
RDEPENDS:libreswan = " \
 systemd \
 nss \
 ldns \
 nss-softokn \
 iproute \
 unbound-libs \
 nss-tools \
 nss-util \
 procps-ng \
 libseccomp \
 libselinux \
 libcap-ng \
 libcurl \
 openldap \
 libevent \
 libxcrypt \
 audit-libs \
 libgcc \
 pam-libs \
 bash \
 logrotate \
 glibc \
 coreutils \
 nspr \
"
