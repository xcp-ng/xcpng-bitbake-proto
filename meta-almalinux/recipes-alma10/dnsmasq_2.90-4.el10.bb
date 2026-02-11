
PN = "dnsmasq"
PE = "0"
PV = "2.90"
PR = "4.el10"
PACKAGES = "dnsmasq dnsmasq-utils dnsmasq-langpack"


URI_dnsmasq = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/dnsmasq-2.90-4.el10.x86_64_v2.rpm;unpack=0"
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
RDEPENDS:dnsmasq-utils = " \
 glibc \
"

URI_dnsmasq-langpack = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/dnsmasq-langpack-2.90-4.el10.noarch.rpm;unpack=0"
RDEPENDS:dnsmasq-langpack = " \
 dnsmasq \
"
