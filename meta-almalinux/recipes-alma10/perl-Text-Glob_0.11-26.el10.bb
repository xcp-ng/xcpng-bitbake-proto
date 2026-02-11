
PN = "perl-Text-Glob"
PE = "0"
PV = "0.11"
PR = "26.el10"
PACKAGES = "perl-Text-Glob perl-Text-Glob-tests"


URI_perl-Text-Glob = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Text-Glob-0.11-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Glob = " \
 perl-constant \
 perl-Exporter \
 perl-libs \
 perl-vars \
"

URI_perl-Text-Glob-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Text-Glob-tests-0.11-26.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Text-Glob-tests = " \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-Text-Glob \
 bash \
 perl-interpreter \
"
