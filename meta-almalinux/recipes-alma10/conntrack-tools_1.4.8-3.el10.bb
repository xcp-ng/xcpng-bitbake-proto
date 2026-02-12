
inherit dnf-bridge

PN = "conntrack-tools"
PE = "0"
PV = "1.4.8"
PR = "3.el10"
PACKAGES = "conntrack-tools"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/conntrack-tools-1.4.8-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_conntrack-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/conntrack-tools-1.4.8-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_conntrack-tools}"
RDEPENDS:conntrack-tools = " \
 systemd \
 systemd-libs \
 libmnl \
 libnetfilter_conntrack \
 bash \
 libnfnetlink \
 libnetfilter_cthelper \
 glibc \
 libnetfilter_cttimeout \
 libnetfilter_queue \
"
