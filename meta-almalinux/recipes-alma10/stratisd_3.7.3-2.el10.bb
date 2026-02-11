
PN = "stratisd"
PE = "0"
PV = "3.7.3"
PR = "2.el10"
PACKAGES = "stratisd stratisd-dracut stratisd-tools"


URI_stratisd = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stratisd-3.7.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:stratisd = "
 python3
 systemd-libs
 cryptsetup-libs
 device-mapper-persistent-data
 libgcc
 libblkid
 bash
 glibc
 xfsprogs
 dbus-libs
"

URI_stratisd-dracut = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stratisd-dracut-3.7.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:stratisd-dracut = "
 systemd
 systemd-libs
 cryptsetup-libs
 libgcc
 libblkid
 stratisd
 bash
 dracut
 glibc
"

URI_stratisd-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/stratisd-tools-3.7.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:stratisd-tools = "
 systemd-libs
 cryptsetup-libs
 libblkid
 libgcc
 stratisd
 glibc
"
