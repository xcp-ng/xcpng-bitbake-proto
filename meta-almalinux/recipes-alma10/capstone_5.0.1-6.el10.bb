
PN = "capstone"
PE = "0"
PV = "5.0.1"
PR = "6.el10"
PACKAGES = "capstone capstone-devel capstone-java python3-capstone"


URI_capstone = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/capstone-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:capstone = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( )"
RPROVIDES:capstone = "libcapstone.so.5()(64bit) ( ) capstone ( =  5.0.1-6.el10) capstone(x86-64) ( =  5.0.1-6.el10)"

URI_capstone-devel = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-devel-5.0.1-6.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:capstone-devel = "/usr/bin/pkg-config ( ) libcapstone.so.5()(64bit) ( ) capstone(x86-64) ( =  5.0.1-6.el10)"
RPROVIDES:capstone-devel = "capstone-devel ( =  5.0.1-6.el10) capstone-devel(x86-64) ( =  5.0.1-6.el10) pkgconfig(capstone) ( =  5.0.1)"

URI_capstone-java = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/capstone-java-5.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:capstone-java = "capstone ( =  5.0.1-6.el10)"
RPROVIDES:capstone-java = "capstone-java ( =  5.0.1-6.el10)"

URI_python3-capstone = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/python3-capstone-5.0.1-6.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-capstone = "python(abi) ( =  3.12) capstone ( =  5.0.1-6.el10)"
RPROVIDES:python3-capstone = "capstone-python3 ( =  5.0.1-6.el10) python-capstone ( =  5.0.1-6.el10) python3-capstone ( =  5.0.1-6.el10) python3.12-capstone ( =  5.0.1-6.el10) python3.12dist(capstone) ( =  5.0.1) python3dist(capstone) ( =  5.0.1)"
