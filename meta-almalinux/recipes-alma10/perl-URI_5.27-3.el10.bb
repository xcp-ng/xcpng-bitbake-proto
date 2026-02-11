
inherit dnf-bridge

PN = "perl-URI"
PE = "0"
PV = "5.27"
PR = "3.el10"
PACKAGES = "perl-URI perl-URI-tests"


URI_perl-URI = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-URI-5.27-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-URI = " \
 perl-libnet \
 perl-constant \
 perl-Scalar-List-Utils \
 perl-libs \
 perl-Carp \
 perl-URI \
 perl-Encode \
 perl-overload \
 perl-PathTools \
 perl-parent \
 perl-Exporter \
 perl-Data-Dumper \
 perl-base \
 perl-MIME-Base64 \
"

URI_perl-URI-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-URI-tests-5.27-3.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-URI-tests = " \
 perl-libnet \
 perl-Test-Harness \
 perl-libs \
 perl-ExtUtils-MakeMaker \
 perl-URI \
 perl-Test-Warnings \
 perl-Test-Simple \
 perl-Storable \
 perl-Encode \
 perl-PathTools \
 bash \
 perl-Test-Needs \
 perl-interpreter \
 perl-Data-Dumper \
 perl-Test-Fatal \
 perl-File-Temp \
"
