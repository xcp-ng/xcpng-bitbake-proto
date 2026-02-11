
PN = "fonttools"
PE = "0"
PV = "4.51.0"
PR = "3.el10"
PACKAGES = "fonttools python3-fonttools"


URI_fonttools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/fonttools-4.51.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:fonttools = "/usr/bin/python3 ( ) python3-fonttools ( ) python3-setuptools ( )"
RPROVIDES:fonttools = "fonttools ( =  4.51.0-3.el10) fonttools(x86-64) ( =  4.51.0-3.el10) ttx ( =  4.51.0-3.el10)"

URI_python3-fonttools = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python3-fonttools-4.51.0-3.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-fonttools = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) python3-lxml ( ) python3-fs ( ) python3-scipy ( ) python3-brotli ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-fonttools = "python-fonttools ( =  4.51.0-3.el10) python3-fonttools ( =  4.51.0-3.el10) python3-fonttools(x86-64) ( =  4.51.0-3.el10) python3.12-fonttools ( =  4.51.0-3.el10) python3.12dist(fonttools) ( =  4.51) python3dist(fonttools) ( =  4.51)"
