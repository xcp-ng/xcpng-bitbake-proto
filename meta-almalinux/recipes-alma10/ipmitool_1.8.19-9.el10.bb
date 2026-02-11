
PN = "ipmitool"
PE = "0"
PV = "1.8.19"
PR = "9.el10"
PACKAGES = "bmc-snmp-proxy exchange-bmc-os-info ipmievd ipmitool"


URI_bmc-snmp-proxy = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bmc-snmp-proxy-1.8.19-9.el10.noarch.rpm;unpack=0"
RDEPENDS:bmc-snmp-proxy = "/usr/bin/sh ( ) net-snmp ( ) exchange-bmc-os-info ( )"
RPROVIDES:bmc-snmp-proxy = "bmc-snmp-proxy ( =  1.8.19-9.el10) config(bmc-snmp-proxy) ( =  1.8.19-9.el10)"

URI_exchange-bmc-os-info = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/exchange-bmc-os-info-1.8.19-9.el10.noarch.rpm;unpack=0"
RDEPENDS:exchange-bmc-os-info = "/bin/sh ( ) systemd ( ) /usr/bin/sh ( ) hostname ( ) ipmitool ( )"
RPROVIDES:exchange-bmc-os-info = "config(exchange-bmc-os-info) ( =  1.8.19-9.el10) exchange-bmc-os-info ( =  1.8.19-9.el10)"

URI_ipmievd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipmievd-1.8.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipmievd = "/bin/sh ( ) systemd ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) ipmitool ( )"
RPROVIDES:ipmievd = "config(ipmievd) ( =  1.8.19-9.el10) ipmievd ( =  1.8.19-9.el10) ipmievd(x86-64) ( =  1.8.19-9.el10)"

URI_ipmitool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/ipmitool-1.8.19-9.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:ipmitool = "systemd ( ) rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) /bin/sh ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libm.so.6(GLIBC_2.29)(64bit) ( ) libcrypto.so.3()(64bit) ( ) libcrypto.so.3(OPENSSL_3.0.0)(64bit) ( ) libreadline.so.8()(64bit) ( )"
RPROVIDES:ipmitool = "OpenIPMI-tools ( =  2.0.14-3) ipmitool ( =  1.8.19-9.el10) ipmitool(x86-64) ( =  1.8.19-9.el10)"
