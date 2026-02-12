
inherit dnf-bridge

PN = "dnsconfd"
PE = "0"
PV = "1.7.2"
PR = "1.el10_0"
PACKAGES = "dnsconfd dnsconfd-dracut dnsconfd-micro dnsconfd-selinux dnsconfd-unbound"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dnsconfd-1.7.2-1.el10_0.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dnsconfd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dnsconfd}"
RDEPENDS:dnsconfd = " \
 python3 \
 python3-pyyaml \
 shadow-utils \
 python3-dbus \
 dnsconfd-unbound \
 dnsconfd-selinux \
 polkit \
 bash \
 python3-gobject-base \
 dbus-common \
 python3-systemd \
"

URI_dnsconfd-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-dracut-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dnsconfd-dracut}"
RDEPENDS:dnsconfd-dracut = " \
 unbound \
 dnsconfd-micro \
 bash \
 dracut \
 dracut-network \
"

URI_dnsconfd-micro = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-micro-1.7.2-1.el10_0.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dnsconfd-micro}"
RDEPENDS:dnsconfd-micro = " \
 systemd-libs \
 dnsconfd \
 dnsconfd-selinux \
 unbound-dracut \
 glib2 \
 libcurl \
 glibc \
"

URI_dnsconfd-selinux = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-selinux-1.7.2-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnsconfd-selinux}"
RDEPENDS:dnsconfd-selinux = " \
 dnsconfd \
 policycoreutils-python-utils \
 policycoreutils \
 bash \
 selinux-policy \
 libselinux-utils \
 selinux-policy-targeted \
"

URI_dnsconfd-unbound = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsconfd-unbound-1.7.2-1.el10_0.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnsconfd-unbound}"
RDEPENDS:dnsconfd-unbound = " \
 dnsconfd \
 bash \
 unbound \
"
