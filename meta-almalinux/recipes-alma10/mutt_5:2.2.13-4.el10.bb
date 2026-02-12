
inherit dnf-bridge

PN = "mutt"
PE = "5"
PV = "2.2.13"
PR = "4.el10"
PACKAGES = "mutt"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/mutt-2.2.13-4.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_mutt = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/mutt-2.2.13-4.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_mutt}"
RDEPENDS:mutt = " \
 zlib-ng-compat \
 perl-libs \
 gnutls \
 gpgme \
 mailcap \
 urlview \
 libgpg-error \
 krb5-libs \
 cyrus-sasl-lib \
 perl-File-Copy \
 ncurses-libs \
 libidn2 \
 tokyocabinet \
 glibc \
 perl-interpreter \
 perl-File-Temp \
 perl-Time-Local \
"
