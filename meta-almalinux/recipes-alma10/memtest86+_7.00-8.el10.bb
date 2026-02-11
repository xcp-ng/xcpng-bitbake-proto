
PN = "memtest86+"
PE = "0"
PV = "7.00"
PR = "8.el10"
PACKAGES = "memtest86+"


URI_memtest86+ = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/memtest86+-7.00-8.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:memtest86+ = "systemd-udev ( >=  252) /bin/sh ( ) /usr/bin/bash ( )"
RPROVIDES:memtest86+ = "memtest86+ ( =  7.00-8.el10) memtest86+(x86-64) ( =  7.00-8.el10)"
