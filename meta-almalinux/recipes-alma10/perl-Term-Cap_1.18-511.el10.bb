
PN = "perl-Term-Cap"
PE = "0"
PV = "1.18"
PR = "511.el10"
PACKAGES = "perl-Term-Cap perl-Term-Cap-tests"


URI_perl-Term-Cap = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Term-Cap-1.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Cap = " \
 ncurses \
 perl-vars \
 perl-libs \
 perl-Carp \
"

URI_perl-Term-Cap-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Term-Cap-tests-1.18-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Term-Cap-tests = " \
 perl-Test-Harness \
 perl-Test-Simple \
 bash \
 perl-Term-Cap \
 perl-interpreter \
"
