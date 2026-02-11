
PN = "kpatch"
PE = "0"
PV = "0.9.7"
PR = "4.el10"
PACKAGES = "kpatch kpatch-dnf"


URI_kpatch = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-0.9.7-4.el10.noarch.rpm;unpack=0"
RDEPENDS:kpatch = "/usr/bin/bash ( ) bash ( ) kmod ( ) binutils ( )"
RPROVIDES:kpatch = "kpatch ( =  0.9.7-4.el10)"

URI_kpatch-dnf = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kpatch-dnf-0.9.7_0.4-4.el10.noarch.rpm;unpack=0"
RDEPENDS:kpatch-dnf = "/bin/sh ( ) python3-dnf ( ) python3-hawkey ( ) python(abi) ( =  3.12)"
RPROVIDES:kpatch-dnf = "kpatch-dnf ( ) config(kpatch-dnf) ( =  0.9.7_0.4-4.el10) kpatch-dnf ( =  0.9.7_0.4-4.el10)"
