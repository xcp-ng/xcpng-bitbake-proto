
inherit dnf-bridge

PN = "perl-Locale-Maketext"
PE = "0"
PV = "1.33"
PR = "512.el10"
PACKAGES = "perl-Locale-Maketext perl-Locale-Maketext-tests"


URI_perl-Locale-Maketext = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Locale-Maketext-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Locale-Maketext = " \
 perl-Locale-Maketext \
 perl-I18N-LangTags \
 perl-libs \
 perl-Carp \
"

URI_perl-Locale-Maketext-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Locale-Maketext-tests-1.33-512.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Locale-Maketext-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Scalar-List-Utils \
 bash \
 perl-parent \
 perl-interpreter \
 perl-Locale-Maketext \
"
