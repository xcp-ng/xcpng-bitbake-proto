
PN = "perl-HTML-Parser"
PE = "0"
PV = "3.82"
PR = "3.el10"
PACKAGES = "perl-HTML-Parser perl-HTML-Parser-tests"


URI_perl-HTML-Parser = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-HTML-Parser-3.82-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-HTML-Parser = " \
 perl-libs \
 perl-Carp \
 perl-URI \
 perl-IO \
 perl-HTML-Parser \
 perl-HTML-Tagset \
 glibc \
 perl-HTTP-Message \
 perl-Exporter \
"

URI_perl-HTML-Parser-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-HTML-Parser-tests-3.82-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:perl-HTML-Parser-tests = " \
 perl-threads \
 perl-Test-Harness \
 perl-libs \
 perl-Test-Simple \
 perl-ExtUtils-MakeMaker \
 perl-IO \
 perl-URI \
 perl-SelectSaver \
 bash \
 perl-PathTools \
 perl-HTML-Parser \
 perl-interpreter \
"
