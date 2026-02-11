
PN = "wireless-regdb"
PE = "0"
PV = "2024.01.23"
PR = "3.el10"
PACKAGES = "wireless-regdb"


URI_wireless-regdb = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/wireless-regdb-2024.01.23-3.el10.noarch.rpm;unpack=0"
RDEPENDS:wireless-regdb = "/usr/bin/sh ( ) udev ( ) iw ( ) systemd ( >=  190)"
RPROVIDES:wireless-regdb = "crda ( =  3.18_2019.03.01-3) wireless-regdb ( =  2024.01.23-3.el10)"
