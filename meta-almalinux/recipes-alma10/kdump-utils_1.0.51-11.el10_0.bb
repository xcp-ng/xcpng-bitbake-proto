
PN = "kdump-utils"
PE = "0"
PV = "1.0.51"
PR = "11.el10_0"
PACKAGES = "kdump-utils"


URI_kdump-utils = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kdump-utils-1.0.51-11.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:kdump-utils = "
 dracut-squash
 kexec-tools
 util-linux
 systemd-udev
 makedumpfile
 bash
 ethtool
 dracut
 sed
 coreutils
 dracut-network
"
