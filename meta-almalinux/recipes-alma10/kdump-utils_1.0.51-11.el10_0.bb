
PN = "kdump-utils"
PE = "0"
PV = "1.0.51"
PR = "11.el10_0"
PACKAGES = "kdump-utils"


URI_kdump-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kdump-utils-1.0.51-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kdump-utils = "/bin/sh ( ) coreutils ( ) sed ( ) /usr/bin/sh ( ) /usr/bin/bash ( ) util-linux ( ) ethtool ( ) makedumpfile ( ) systemd-udev(x86-64) ( ) dracut ( >=  058) dracut-network ( >=  058) dracut-squash ( >=  058) kexec-tools ( >=  2.0.28-8)"
RPROVIDES:kdump-utils = "config(kdump-utils) ( =  1.0.51-11.el10_0) kdump-utils ( =  1.0.51-11.el10_0) kdump-utils(x86-64) ( =  1.0.51-11.el10_0)"
