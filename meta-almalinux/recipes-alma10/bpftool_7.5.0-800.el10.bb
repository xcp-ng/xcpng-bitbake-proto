
PN = "bpftool"
PE = "0"
PV = "7.5.0"
PR = "800.el10"
PACKAGES = "bpftool"


URI_bpftool = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/bpftool-7.5.0-800.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:bpftool = "
 glibc
 libcap
 zlib-ng-compat
 elfutils-libelf
"
