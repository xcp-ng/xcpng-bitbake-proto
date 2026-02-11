
PN = "i2c-tools"
PE = "0"
PV = "4.3"
PR = "14.el10"
PACKAGES = "i2c-tools i2c-tools-perl libi2c python3-i2c-tools libi2c-devel"


URI_i2c-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/i2c-tools-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:i2c-tools = "
 libi2c
 systemd-udev
 kmod
 bash
 glibc
"

URI_i2c-tools-perl = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/i2c-tools-perl-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:i2c-tools-perl = "
 perl-constant
 perl-libs
 libi2c
 perl-vars
 perl-Fcntl
 perl-POSIX
 perl-File-Basename
 perl-interpreter
"

URI_libi2c = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/libi2c-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2c = "
 glibc
"

URI_python3-i2c-tools = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-i2c-tools-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-i2c-tools = "
 glibc
 libi2c
 python3
"

URI_libi2c-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/libi2c-devel-4.3-14.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:libi2c-devel = "
 libi2c
"
