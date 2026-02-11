
PN = "kexec-tools"
PE = "0"
PV = "2.0.29"
PR = "2.el10"
PACKAGES = "kexec-tools"


URI_kexec-tools = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/kexec-tools-2.0.29-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:kexec-tools = " \
 glibc \
 zlib-ng-compat \
 xz-libs \
"
