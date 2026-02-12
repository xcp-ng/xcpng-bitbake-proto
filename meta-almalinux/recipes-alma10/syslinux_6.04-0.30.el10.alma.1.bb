
inherit dnf-bridge

PN = "syslinux"
PE = "0"
PV = "6.04"
PR = "0.30.el10.alma.1"
PACKAGES = "syslinux syslinux-extlinux syslinux-extlinux-nonlinux syslinux-nonlinux syslinux-tftpboot syslinux-devel syslinux-efi64 syslinux-perl"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/syslinux-6.04-0.30.el10.alma.1.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_syslinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_syslinux}"
RDEPENDS:syslinux = " \
 glibc \
 libuuid \
 syslinux-nonlinux \
 mtools \
"

URI_syslinux-extlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-extlinux-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_syslinux-extlinux}"
RDEPENDS:syslinux-extlinux = " \
 glibc \
 syslinux-extlinux-nonlinux \
 bash \
 syslinux \
"

URI_syslinux-extlinux-nonlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-extlinux-nonlinux-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_syslinux-extlinux-nonlinux}"
RDEPENDS:syslinux-extlinux-nonlinux = " \
 glibc \
 syslinux \
"

URI_syslinux-nonlinux = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/syslinux-nonlinux-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_syslinux-nonlinux}"
RDEPENDS:syslinux-nonlinux = " \
 glibc \
 syslinux \
"

URI_syslinux-tftpboot = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/syslinux-tftpboot-6.04-0.30.el10.alma.1.noarch.rpm;unpack=0"
SRC_URI += "${URI_syslinux-tftpboot}"
RDEPENDS:syslinux-tftpboot = " \
 glibc \
"

URI_syslinux-devel = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-devel-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_syslinux-devel}"
RDEPENDS:syslinux-devel = " \
 glibc \
"

URI_syslinux-efi64 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-efi64-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_syslinux-efi64}"
RDEPENDS:syslinux-efi64 = " \
 glibc \
"

URI_syslinux-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/syslinux-perl-6.04-0.30.el10.alma.1.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_syslinux-perl}"
RDEPENDS:syslinux-perl = " \
 perl-libs \
 perl-IO \
 perl-Socket \
 perl-Digest-SHA \
 perl-Fcntl \
 perl-PathTools \
 perl-Errno \
 perl-interpreter \
 perl-Crypt-PasswdMD5 \
 perl-MIME-Base64 \
"
