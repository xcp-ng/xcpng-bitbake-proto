
PN = "ipmitool"
PE = "0"
PV = "1.8.19"
PR = "9.el10"
PACKAGES = "bmc-snmp-proxy exchange-bmc-os-info ipmievd ipmitool"


URI_bmc-snmp-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bmc-snmp-proxy-1.8.19-9.el10.noarch.rpm;unpack=0"
RDEPENDS:bmc-snmp-proxy = " \
 net-snmp \
 bash \
 exchange-bmc-os-info \
"

URI_exchange-bmc-os-info = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exchange-bmc-os-info-1.8.19-9.el10.noarch.rpm;unpack=0"
RDEPENDS:exchange-bmc-os-info = " \
 systemd \
 bash \
 hostname \
 ipmitool \
"

URI_ipmievd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipmievd-1.8.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipmievd = " \
 systemd \
 openssl-libs \
 ipmitool \
 bash \
 glibc \
"

URI_ipmitool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipmitool-1.8.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipmitool = " \
 systemd \
 openssl-libs \
 readline \
 bash \
 glibc \
"
