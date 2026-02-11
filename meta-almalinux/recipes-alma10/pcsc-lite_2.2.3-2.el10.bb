
PN = "pcsc-lite"
PE = "0"
PV = "2.2.3"
PR = "2.el10"
PACKAGES = "pcsc-lite pcsc-lite-libs pcsc-lite-devel pcsc-lite-doc"


URI_pcsc-lite = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite = "
 python3
 systemd
 systemd-libs
 polkit
 polkit-libs
 bash
 glib2
 pcsc-lite-libs
 pcsc-lite-ccid
 glibc
"

URI_pcsc-lite-libs = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/pcsc-lite-libs-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-libs = "
 glibc
"

URI_pcsc-lite-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/pcsc-lite-devel-2.2.3-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:pcsc-lite-devel = "
 glibc
 pcsc-lite-libs
 pkgconf-pkg-config
 python3
"

URI_pcsc-lite-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/pcsc-lite-doc-2.2.3-2.el10.noarch.rpm;unpack=0"
RDEPENDS:pcsc-lite-doc = "
 pcsc-lite-libs
"
