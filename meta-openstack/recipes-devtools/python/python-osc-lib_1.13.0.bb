inherit setuptools pypi
require python-osc-lib.inc

# Satisfy setup.py 'setup_requires'
DEPENDS += " \
        python-pbr-native \
        "