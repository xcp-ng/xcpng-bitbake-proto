
inherit dnf-bridge

PN = "dnsmasq"
PE = "0"
PV = "2.90"
PR = "4.el10"
PACKAGES = "dnsmasq dnsmasq-utils dnsmasq-langpack"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/dnsmasq-2.90-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_dnsmasq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsmasq-2.90-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dnsmasq}"
RDEPENDS:dnsmasq = " \
 gmp \
 libnetfilter_conntrack \
 bash \
 glibc \
 libidn2 \
 dbus-libs \
 nettle \
"

URI_dnsmasq-utils = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsmasq-utils-2.90-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_dnsmasq-utils}"
RDEPENDS:dnsmasq-utils = " \
 glibc \
"

URI_dnsmasq-langpack = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dnsmasq-langpack-2.90-4.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_dnsmasq-langpack}"
RDEPENDS:dnsmasq-langpack = " \
 dnsmasq \
"
