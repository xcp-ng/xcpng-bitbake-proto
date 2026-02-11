
PN = "perl-Thread-Queue"
PE = "0"
PV = "3.14"
PR = "511.el10"
PACKAGES = "perl-Thread-Queue perl-Thread-Queue-tests"


URI_perl-Thread-Queue = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/perl-Thread-Queue-3.14-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Thread-Queue = "perl(strict) ( ) perl-libs ( ) perl(warnings) ( ) perl(Carp) ( ) perl(Scalar::Util) ( >=  1.10) perl(threads::shared) ( >=  1.21)"
RPROVIDES:perl-Thread-Queue = "perl(Thread::Queue) ( =  3.14) perl-Thread-Queue ( =  3.14-511.el10)"

URI_perl-Thread-Queue-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/perl-Thread-Queue-tests-3.14-511.el10.noarch.rpm;unpack=0"
RDEPENDS:perl-Thread-Queue-tests = "perl(strict) ( ) /usr/bin/perl ( ) /usr/bin/sh ( ) perl-Test-Harness ( ) perl(warnings) ( ) perl(Test::More) ( ) perl(Config) ( ) perl(Exporter) ( ) perl(Scalar::Util) ( ) perl(threads) ( ) perl(threads::shared) ( ) perl(Thread::Queue) ( ) perl(Thread::Semaphore) ( ) perl-Thread-Queue ( =  3.14-511.el10)"
RPROVIDES:perl-Thread-Queue-tests = "perl-Thread-Queue-tests ( =  3.14-511.el10)"
