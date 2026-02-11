
PN = "ipset"
PE = "0"
PV = "7.22"
PR = "7.el10_0"
PACKAGES = "ipset ipset-libs ipset-service ipset-devel"


URI_ipset = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ipset-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset = "
 ipset-libs
 kernel-modules-extra
 bash
 glibc
 kernel-debug-modules-extra
"

URI_ipset-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/ipset-libs-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset-libs = "
 glibc
 libmnl
"

URI_ipset-service = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipset-service-7.22-7.el10_0.noarch.rpm;unpack=0"
RDEPENDS:ipset-service = "
 ipset
 systemd
 bash
 iptables-nft-services
"

URI_ipset-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/ipset-devel-7.22-7.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipset-devel = "
 ipset-libs
 kernel-headers
 pkgconf-pkg-config
 libmnl-devel
"
