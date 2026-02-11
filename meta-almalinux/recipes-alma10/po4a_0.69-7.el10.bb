
inherit dnf-bridge

PN = "po4a"
PE = "0"
PV = "0.69"
PR = "7.el10"
PACKAGES = "po4a"


URI_po4a = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/po4a-0.69-7.el10.noarch.rpm;unpack=0"
RDEPENDS:po4a = " \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Locale-gettext \
 perl-Getopt-Long \
 perl-Getopt-Std \
 perl-Pod-Parser \
 perl-Syntax-Keyword-Try \
 perl-subs \
 perl-TermReadKey \
 perl-Carp \
 perl-Text-WrapI18N \
 perl-vars \
 perl-IO \
 perl-I18N-Langinfo \
 perl-YAML-Tiny \
 perl-Time-Local \
 perl-Unicode-LineBreak \
 texlive-kpathsea \
 po4a \
 perl-DynaLoader \
 perl-Encode \
 bash \
 opensp \
 perl-Exporter \
 libxslt \
 perl-Fcntl \
 gettext \
 perl-File-Basename \
 perl-POSIX \
 perl-File-Copy \
 perl-PathTools \
 perl-interpreter \
 perl-File-Path \
 perl-File-Temp \
 perl-Pod-Usage \
"
