
PN = "weldr-client"
PE = "0"
PV = "35.11"
PR = "4.el10"
PACKAGES = "weldr-client weldr-client-tests"


URI_weldr-client = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/weldr-client-35.11-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:weldr-client = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( ) diffutils ( )"
RPROVIDES:weldr-client = "composer-cli ( =  35.11-4.el10) weldr-client ( =  35.11-4.el10) weldr-client(x86-64) ( =  35.11-4.el10)"

URI_weldr-client-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/weldr-client-tests-35.11-4.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:weldr-client-tests = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libresolv.so.2()(64bit) ( ) createrepo_c ( )"
RPROVIDES:weldr-client-tests = "weldr-client-tests ( =  35.11-4.el10) weldr-client-tests(x86-64) ( =  35.11-4.el10)"
