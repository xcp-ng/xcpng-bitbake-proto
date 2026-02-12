
inherit dnf-bridge

PN = "perl-LWP-Protocol-https"
PE = "0"
PV = "6.13"
PR = "3.el10"
PACKAGES = "perl-LWP-Protocol-https perl-LWP-Protocol-https-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/perl-LWP-Protocol-https-6.13-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_perl-LWP-Protocol-https = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-LWP-Protocol-https-6.13-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-LWP-Protocol-https}"
RDEPENDS:perl-LWP-Protocol-https = " \
 perl-libs \
 perl-libwww-perl \
 perl-IO-Socket-SSL \
 perl-Mozilla-CA \
 perl-Net-HTTP \
 perl-base \
"

URI_perl-LWP-Protocol-https-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-LWP-Protocol-https-tests-6.13-3.el10.noarch.rpm;unpack=0"
SRC_URI += "${URI_perl-LWP-Protocol-https-tests}"
RDEPENDS:perl-LWP-Protocol-https-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Try-Tiny \
 perl-IO \
 perl-libwww-perl \
 perl-Socket \
 perl-IO-Socket-SSL \
 bash \
 perl-Test-Needs \
 perl-LWP-Protocol-https \
 perl-interpreter \
 perl-File-Temp \
"
