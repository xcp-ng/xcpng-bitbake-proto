
PN = "debugedit"
PE = "0"
PV = "5.1"
PR = "5.el10_0"
PACKAGES = "debugedit"


URI_debugedit = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/debugedit-5.1-5.el10_0.x86_64_v2.rpm;unpack=0"
RDEPENDS:debugedit = " \
 elfutils \
 gdb-headless \
 gawk \
 grep \
 elfutils-libelf \
 dwz \
 elfutils-libs \
 bash \
 binutils \
 xz \
 glibc \
 coreutils \
 sed \
 findutils \
"
