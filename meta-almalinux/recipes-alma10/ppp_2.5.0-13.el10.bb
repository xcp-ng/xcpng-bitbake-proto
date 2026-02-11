
inherit dnf-bridge

PN = "ppp"
PE = "0"
PV = "2.5.0"
PR = "13.el10"
PACKAGES = "ppp ppp-devel"


URI_ppp = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ppp-2.5.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ppp = " \
 glibc-common \
 libpcap \
 shadow-utils \
 systemd \
 systemd-libs \
 libxcrypt \
 openssl-libs \
 authselect-libs \
 pam-libs \
 bash \
 glib2 \
 glibc \
"

URI_ppp-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ppp-devel-2.5.0-13.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ppp-devel = " \
 pkgconf-pkg-config \
 ppp \
"
