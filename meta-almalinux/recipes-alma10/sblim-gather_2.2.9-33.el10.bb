
PN = "sblim-gather"
PE = "0"
PV = "2.2.9"
PR = "33.el10"
PACKAGES = "sblim-gather sblim-gather-devel sblim-gather-provider sblim-gather-test"


URI_sblim-gather = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-gather-2.2.9-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-gather = "
 systemd
 libgcc
 sblim-sfcb
 bash
 glibc
 libvirt-libs
"

URI_sblim-gather-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-gather-devel-2.2.9-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-gather-devel = "
 sblim-sfcb
 sblim-gather
"

URI_sblim-gather-provider = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-gather-provider-2.2.9-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-gather-provider = "
 sblim-cmpi-base
 sblim-sfcb
 sblim-gather
 bash
 glibc
"

URI_sblim-gather-test = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/sblim-gather-test-2.2.9-33.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:sblim-gather-test = "
 sblim-sfcb
 bash
 sblim-gather-provider
"
