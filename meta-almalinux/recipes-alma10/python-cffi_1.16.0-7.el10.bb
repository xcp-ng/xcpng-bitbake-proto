
PN = "python-cffi"
PE = "0"
PV = "1.16.0"
PR = "7.el10"
PACKAGES = "python3-cffi python-cffi-doc"


URI_python3-cffi = "https://vault.almalinux.org/10.0/BaseOS/x86_64_v2/os/Packages/python3-cffi-1.16.0-7.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:python3-cffi = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libffi.so.8()(64bit) ( ) libffi.so.8(LIBFFI_BASE_8.0)(64bit) ( ) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) ( ) python3.12dist(pycparser) ( ) python(abi) ( =  3.12)"
RPROVIDES:python3-cffi = "python-cffi ( =  1.16.0-7.el10) python3-cffi ( =  1.16.0-7.el10) python3-cffi(x86-64) ( =  1.16.0-7.el10) python3.12-cffi ( =  1.16.0-7.el10) python3.12dist(cffi) ( =  1.16) python3dist(cffi) ( =  1.16)"

URI_python-cffi-doc = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/python-cffi-doc-1.16.0-7.el10.noarch.rpm;unpack=0"
RDEPENDS:python-cffi-doc = ""
RPROVIDES:python-cffi-doc = "python-cffi-doc ( =  1.16.0-7.el10)"
