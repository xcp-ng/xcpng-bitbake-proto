
PN = "perl-Encode-Locale"
PE = "0"
PV = "1.05"
PR = "31.el10"
PACKAGES = "perl-Encode-Locale perl-Encode-Locale-tests"


URI_perl-Encode-Locale = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Encode-Locale-1.05-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Encode-Locale = " \
 perl-libs \
 perl-I18N-Langinfo \
 perl-Encode \
 perl-Exporter \
 perl-base \
"

URI_perl-Encode-Locale-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Encode-Locale-tests-1.05-31.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Encode-Locale-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Encode-Locale \
 bash \
 perl-interpreter \
"
