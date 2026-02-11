
PN = "python-rpm-macros"
PE = "0"
PV = "3.12"
PR = "9.1.el10"
PACKAGES = "python-rpm-macros python-srpm-macros python3-rpm-macros"


URI_python-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-rpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-rpm-macros = "python-srpm-macros ( =  3.12-9.1.el10)"
RPROVIDES:python-rpm-macros = "rpm_macro(_py_shebang_P) ( ) rpm_macro(_py_shebang_s) ( ) rpm_macro(_python_memoize) ( ) rpm_macro(py_build) ( ) rpm_macro(py_build_wheel) ( ) rpm_macro(py_byte_compile) ( ) rpm_macro(py_check_import) ( ) rpm_macro(py_install) ( ) rpm_macro(py_install_wheel) ( ) rpm_macro(py_setup) ( ) rpm_macro(py_shbang_opts) ( ) rpm_macro(py_shbang_opts_nodash) ( ) rpm_macro(py_shebang_fix) ( ) rpm_macro(py_shebang_flags) ( ) rpm_macro(py_test_envvars) ( ) rpm_macro(python_cache_tag) ( ) rpm_macro(python_disable_dependency_generator) ( ) rpm_macro(python_ext_suffix) ( ) rpm_macro(python_platform) ( ) rpm_macro(python_platform_triplet) ( ) rpm_macro(python_provide) ( ) rpm_macro(python_sitearch) ( ) rpm_macro(python_sitelib) ( ) rpm_macro(python_version) ( ) rpm_macro(python_version_nodots) ( ) python-rpm-macros ( =  3.12-9.1.el10)"

URI_python-srpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python-srpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
RDEPENDS:python-srpm-macros = "/usr/bin/sh ( ) /usr/bin/bash ( ) redhat-rpm-config ( >=  190)"
RPROVIDES:python-srpm-macros = "rpm_lua(fedora.srpm.python) ( ) rpm_macro(_python_bytecompile_errors_terminate_build) ( ) rpm_macro(_python_bytecompile_extra) ( ) rpm_macro(py2_dist) ( ) rpm_macro(py3_dist) ( ) rpm_macro(py_auto_byte_compile) ( ) rpm_macro(py_dist_name) ( ) rpm_macro(py_provides) ( ) rpm_macro(pypi_source) ( ) rpm_macro(python) ( ) rpm_macro(python2) ( ) rpm_macro(python3) ( ) rpm_macro(python3_pkgversion) ( ) rpm_macro(python_extras_subpkg) ( ) rpm_macro(python_wheel_dir) ( ) rpm_macro(python_wheel_pkg_prefix) ( ) python-srpm-macros ( =  3.12-9.1.el10) bundled(python3dist(compileall2)) ( =  0.7.1)"

URI_python3-rpm-macros = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/python3-rpm-macros-3.12-9.1.el10.noarch.rpm;unpack=0"
RDEPENDS:python3-rpm-macros = "python-srpm-macros ( =  3.12-9.1.el10) python-rpm-macros ( =  3.12-9.1.el10)"
RPROVIDES:python3-rpm-macros = "rpm_macro(_py3_shebang_P) ( ) rpm_macro(_py3_shebang_s) ( ) rpm_macro(py3_build) ( ) rpm_macro(py3_build_wheel) ( ) rpm_macro(py3_check_import) ( ) rpm_macro(py3_install) ( ) rpm_macro(py3_install_wheel) ( ) rpm_macro(py3_shbang_opts) ( ) rpm_macro(py3_shbang_opts_nodash) ( ) rpm_macro(py3_shebang_fix) ( ) rpm_macro(py3_shebang_flags) ( ) rpm_macro(py3_test_envvars) ( ) rpm_macro(py3dir) ( ) rpm_macro(pycached) ( ) rpm_macro(pytest) ( ) rpm_macro(python3_cache_tag) ( ) rpm_macro(python3_ext_suffix) ( ) rpm_macro(python3_platform) ( ) rpm_macro(python3_platform_triplet) ( ) rpm_macro(python3_sitearch) ( ) rpm_macro(python3_sitelib) ( ) rpm_macro(python3_version) ( ) rpm_macro(python3_version_nodots) ( ) python3-rpm-macros ( =  3.12-9.1.el10)"
