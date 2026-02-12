
inherit dnf-bridge

PN = "texinfo"
PE = "0"
PV = "7.1"
PR = "6.el10"
PACKAGES = "info texinfo texinfo-tex"


URI_src = "https://vault.almalinux.org/10.0/BaseOS/Source/Packages/texinfo-7.1-6.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_info = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/info-7.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_info}"
RDEPENDS:info = " \
 glibc \
 bash \
 ncurses-libs \
"

URI_texinfo = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texinfo-7.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_texinfo}"
RDEPENDS:texinfo = " \
 perl-libs \
 perl-Storable \
 perl-Getopt-Long \
 perl-Symbol \
 perl-Carp \
 perl-vars \
 perl-Unicode-EastAsianWidth \
 perl-Text-Unidecode \
 perl-IPC-Open3 \
 perl-Data-Dumper \
 perl-MIME-Base64 \
 perl-Unicode-Normalize \
 perl-DynaLoader \
 perl-Encode \
 perl-Exporter \
 perl-File-Basename \
 perl-POSIX \
 perl-File-Copy \
 perl-PathTools \
 perl-if \
 perl-interpreter \
 perl-File-Path \
 perl-Pod-Simple \
 perl-libintl-perl \
"

URI_texinfo-tex = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/texinfo-tex-7.1-6.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_texinfo-tex}"
RDEPENDS:texinfo-tex = " \
 texlive-texlive-scripts-extra \
 texinfo \
 bash \
 texlive-epsf \
 texlive-collection-basic \
"
