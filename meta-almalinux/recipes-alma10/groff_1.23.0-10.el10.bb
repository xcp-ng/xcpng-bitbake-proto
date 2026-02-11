
PN = "groff"
PE = "0"
PV = "1.23.0"
PR = "10.el10"
PACKAGES = "groff-base groff groff-doc groff-perl groff-x11"


URI_groff-base = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/groff-base-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-base = " \
 libgcc \
 libstdc++ \
 bash \
 glibc \
 alternatives \
"

URI_groff = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/groff-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff = " \
 coreutils \
 libgcc \
 groff-base \
 libstdc++ \
 bash \
 glibc \
 alternatives \
"

URI_groff-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-doc-1.23.0-10.el10.noarch.rpm;unpack=0"
RDEPENDS:groff-doc = " \
 groff \
"

URI_groff-perl = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-perl-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-perl = " \
 perl-constant \
 perl-libs \
 perl-Carp \
 perl-Math-Complex \
 perl-FindBin \
 perl-Getopt-Long \
 perl-File-Basename \
 perl-POSIX \
 groff-base \
 perl-File-Copy \
 perl-PathTools \
 perl-File-HomeDir \
 perl-interpreter \
 perl-File-Path \
 perl-Data-Dumper \
 perl-File-Temp \
"

URI_groff-x11 = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/groff-x11-1.23.0-10.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:groff-x11 = " \
 libXmu \
 groff-base \
 libX11 \
 libXt \
 libXaw \
 glibc \
"
